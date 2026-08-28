import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gjg {
   static gjg.a a(feo $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gjg.a a(SequencedMap<gjq, feo> $$0, feo $$1) {
      return new gjg.a($$1, $$0);
   }

   fev getBuffer(gjq var1);

   public static class a implements gjg {
      protected final feo a;
      protected final SequencedMap<gjq, feo> b;
      protected final Map<gjq, fem> c = new HashMap<>();
      @Nullable
      protected gjq d;

      protected a(feo $$0, SequencedMap<gjq, feo> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fev getBuffer(gjq $$0) {
         fem $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.S()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            feo $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fem($$2, $$0.O(), $$0.N());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fem(this.a, $$0.O(), $$0.N());
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

         for (gjq $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gjq $$0) {
         fem $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gjq $$0, fem $$1) {
         feq $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.T()) {
               feo $$3 = this.b.getOrDefault($$0, this.a);
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
