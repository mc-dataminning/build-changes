import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface ghw {
   static ghw.a a(fdq $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static ghw.a a(SequencedMap<gig, fdq> $$0, fdq $$1) {
      return new ghw.a($$1, $$0);
   }

   fdx getBuffer(gig var1);

   public static class a implements ghw {
      protected final fdq a;
      protected final SequencedMap<gig, fdq> b;
      protected final Map<gig, fdo> c = new HashMap<>();
      @Nullable
      protected gig d;

      protected a(fdq $$0, SequencedMap<gig, fdq> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fdx getBuffer(gig $$0) {
         fdo $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.S()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fdq $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fdo($$2, $$0.O(), $$0.N());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fdo(this.a, $$0.O(), $$0.N());
               this.d = $$0;
            }

            this.c.put($$0, $$1);
            return $$1;
         }
      }

      public void a() {
         if (this.d != null) {
            this.a(this.d);
            this.d = null;
         }
      }

      public void b() {
         this.a();

         for (gig $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gig $$0) {
         fdo $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gig $$0, fdo $$1) {
         fds $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.T()) {
               fdq $$3 = this.b.getOrDefault($$0, this.a);
               $$2.a($$3, RenderSystem.getVertexSorting());
            }

            $$0.a($$2);
         }

         if ($$0.equals(this.d)) {
            this.d = null;
         }
      }
   }
}
