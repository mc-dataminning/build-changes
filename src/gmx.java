import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gmx {
   static gmx.a a(fgo $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gmx.a a(SequencedMap<gnh, fgo> $$0, fgo $$1) {
      return new gmx.a($$1, $$0);
   }

   fgv getBuffer(gnh var1);

   public static class a implements gmx {
      protected final fgo a;
      protected final SequencedMap<gnh, fgo> b;
      protected final Map<gnh, fgm> c = new HashMap<>();
      @Nullable
      protected gnh d;

      protected a(fgo $$0, SequencedMap<gnh, fgo> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fgv getBuffer(gnh $$0) {
         fgm $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.X()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fgo $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fgm($$2, $$0.T(), $$0.S());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fgm(this.a, $$0.T(), $$0.S());
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

         for (gnh $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gnh $$0) {
         fgm $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gnh $$0, fgm $$1) {
         fgq $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Y()) {
               fgo $$3 = this.b.getOrDefault($$0, this.a);
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
