import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface glv {
   static glv.a a(ffp $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static glv.a a(SequencedMap<gmf, ffp> $$0, ffp $$1) {
      return new glv.a($$1, $$0);
   }

   ffw getBuffer(gmf var1);

   public static class a implements glv {
      protected final ffp a;
      protected final SequencedMap<gmf, ffp> b;
      protected final Map<gmf, ffn> c = new HashMap<>();
      @Nullable
      protected gmf d;

      protected a(ffp $$0, SequencedMap<gmf, ffp> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ffw getBuffer(gmf $$0) {
         ffn $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            ffp $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new ffn($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new ffn(this.a, $$0.T(), $$0.S());
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

         for (gmf $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gmf $$0) {
         ffn $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gmf $$0, ffn $$1) {
         ffr $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               ffp $$3 = this.b.getOrDefault($$0, this.a);
               $$2.a($$3, RenderSystem.getProjectionType().a());
            }

            $$0.a($$2);
         }

         if ($$0.equals(this.d)) {
            this.d = null;
         }
      }
   }
}
