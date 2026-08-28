import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gqm {
   static gqm.a a(fjv $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gqm.a a(SequencedMap<gqx, fjv> $$0, fjv $$1) {
      return new gqm.a($$1, $$0);
   }

   fkc getBuffer(gqx var1);

   public static class a implements gqm {
      protected final fjv a;
      protected final SequencedMap<gqx, fjv> b;
      protected final Map<gqx, fju> c = new HashMap<>();
      @Nullable
      protected gqx d;

      protected a(fjv $$0, SequencedMap<gqx, fjv> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fkc getBuffer(gqx $$0) {
         fju $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.ab()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fjv $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fju($$2, $$0.X(), $$0.W());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fju(this.a, $$0.X(), $$0.W());
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

         for (gqx $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gqx $$0) {
         fju $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gqx $$0, fju $$1) {
         fjx $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.ac()) {
               fjv $$3 = this.b.getOrDefault($$0, this.a);
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
