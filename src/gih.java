import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gih {
   static gih.a a(fdy $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gih.a a(SequencedMap<gir, fdy> $$0, fdy $$1) {
      return new gih.a($$1, $$0);
   }

   fef getBuffer(gir var1);

   public static class a implements gih {
      protected final fdy a;
      protected final SequencedMap<gir, fdy> b;
      protected final Map<gir, fdw> c = new HashMap<>();
      @Nullable
      protected gir d;

      protected a(fdy $$0, SequencedMap<gir, fdy> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fef getBuffer(gir $$0) {
         fdw $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.S()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fdy $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fdw($$2, $$0.O(), $$0.N());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fdw(this.a, $$0.O(), $$0.N());
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

         for (gir $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gir $$0) {
         fdw $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gir $$0, fdw $$1) {
         fea $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.T()) {
               fdy $$3 = this.b.getOrDefault($$0, this.a);
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
