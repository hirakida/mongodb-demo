<template>
  <div>
    <h1>bookmark</h1>
    <div>
      <router-link to="/bookmarks">back</router-link>
    </div>
    <table class="table" v-for="bookmark in bookmarks"
           v-if="bookmark.bookmarkId === $route.params.id">
      <thead>
      </thead>
      <tbody>
      <tr>
        <th>image</th>
        <td>
          <img v-bind:src="bookmark.mediumImageUrl">
        </td>
      </tr>
      <tr>
        <th>bookmarkId</th>
        <td>{{bookmark.bookmarkId}}</td>
      </tr>
      <tr>
        <th>itemCode</th>
        <td>{{bookmark.itemCode}}</td>
      </tr>
      <tr>
        <th>productId</th>
        <td>{{bookmark.productId}}</td>
      </tr>
      <tr>
        <th>shopName</th>
        <td>{{bookmark.shopName}}</td>
      </tr>
      <tr>
        <th>shopUrl</th>
        <td>{{bookmark.shopUrl}}</td>
      </tr>
      <tr>
        <th>itemName</th>
        <td>{{bookmark.itemName}}</td>
      </tr>
      <tr>
        <th>itemUrl</th>
        <td>{{bookmark.itemUrl}}</td>
      </tr>
      <tr>
        <th>smallImageUrl</th>
        <td>{{bookmark.smallImageUrl}}</td>
      </tr>
      <tr>
        <th>mediumImageUrl</th>
        <td>{{bookmark.mediumImageUrl}}</td>
      </tr>
      <tr>
        <th>reviewCount</th>
        <td>{{bookmark.reviewCount}}</td>
      </tr>
      <tr>
        <th>reviewUrl</th>
        <td>{{bookmark.reviewUrl}}</td>
      </tr>
      <tr>
        <th>pointRate</th>
        <td>{{bookmark.pointRate}}</td>
      </tr>
      <tr>
        <th>reviewAverage</th>
        <td>{{bookmark.reviewAverage}}</td>
      </tr>
      <tr>
        <th>postageFlag</th>
        <td>{{bookmark.postageFlag}}</td>
      </tr>
      <tr>
        <th>taxFlag</th>
        <td>{{bookmark.taxFlag}}</td>
      </tr>
      <tr>
        <th>affiliateUrl</th>
        <td>{{bookmark.affiliateUrl}}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>
<script>
  import {mapGetters} from 'vuex'

  export default {
    computed: mapGetters(['bookmarks'])
  }
</script>
