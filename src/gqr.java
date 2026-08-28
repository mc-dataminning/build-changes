import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gqr {
   static gqr.a a(fka $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gqr.a a(SequencedMap<grc, fka> $$0, fka $$1) {
      return new gqr.a($$1, $$0);
   }

   fkh getBuffer(grc var1);

   public static class a implements gqr {
      protected final fka a;
      protected final SequencedMap<grc, fka> b;
      protected final Map<grc, fjz> c = new HashMap<>();
      @Nullable
      protected grc d;

      protected a(fka $$0, SequencedMap<grc, fka> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fkh getBuffer(grc $$0) {
         fjz $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.ab()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fka $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fjz($$2, $$0.X(), $$0.W());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fjz(this.a, $$0.X(), $$0.W());
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

         for (grc $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(grc $$0) {
         fjz $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(grc $$0, fjz $$1) {
         fkc $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.ac()) {
               fka $$3 = this.b.getOrDefault($$0, this.a);
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
