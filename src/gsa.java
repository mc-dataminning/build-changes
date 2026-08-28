import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gsa {
   static gsa.a a(fll $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gsa.a a(SequencedMap<gsl, fll> $$0, fll $$1) {
      return new gsa.a($$1, $$0);
   }

   flr getBuffer(gsl var1);

   public static class a implements gsa {
      protected final fll a;
      protected final SequencedMap<gsl, fll> b;
      protected final Map<gsl, flk> c = new HashMap<>();
      @Nullable
      protected gsl d;

      protected a(fll $$0, SequencedMap<gsl, fll> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public flr getBuffer(gsl $$0) {
         flk $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.U()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fll $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new flk($$2, $$0.Q(), $$0.P());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new flk(this.a, $$0.Q(), $$0.P());
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

         for (gsl $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gsl $$0) {
         flk $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gsl $$0, flk $$1) {
         fln $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.V()) {
               fll $$3 = this.b.getOrDefault($$0, this.a);
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
