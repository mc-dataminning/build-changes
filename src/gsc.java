import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gsc {
   static gsc.a a(fln $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gsc.a a(SequencedMap<gsn, fln> $$0, fln $$1) {
      return new gsc.a($$1, $$0);
   }

   flt getBuffer(gsn var1);

   public static class a implements gsc {
      protected final fln a;
      protected final SequencedMap<gsn, fln> b;
      protected final Map<gsn, flm> c = new HashMap<>();
      @Nullable
      protected gsn d;

      protected a(fln $$0, SequencedMap<gsn, fln> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public flt getBuffer(gsn $$0) {
         flm $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.U()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fln $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new flm($$2, $$0.Q(), $$0.P());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new flm(this.a, $$0.Q(), $$0.P());
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

         for (gsn $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gsn $$0) {
         flm $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gsn $$0, flm $$1) {
         flp $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.V()) {
               fln $$3 = this.b.getOrDefault($$0, this.a);
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
