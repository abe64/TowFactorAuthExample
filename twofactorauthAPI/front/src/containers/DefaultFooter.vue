<template>
      <TheFooter>
        <div>
          <!--footer-->
          <a href="https://www.sharecrest.com/">ShareCrest</a>
          <span class="ml-1">&copy; 2005 ShareCrest Co.,Ltd.</span>
        </div>
        <!-- <div class="ml-auto">
          <span class="mr-1">Powered by</span>
          <a href="https://www.sharecrest.com/">CoreUI for Vue</a>
        </div> -->
      </TheFooter>
</template>
<script>
import { Footer as TheFooter } from '@coreui/vue'
export default {
  name: 'DefaultFooter',
  components: {
    TheFooter
  },
}
</script>
