import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface ghg {
   static ghg.a a(fdb $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static ghg.a a(SequencedMap<ghq, fdb> $$0, fdb $$1) {
      return new ghg.a($$1, $$0);
   }

   fdi getBuffer(ghq var1);

   public static class a implements ghg {
      protected final fdb a;
      protected final SequencedMap<ghq, fdb> b;
      protected final Map<ghq, fcz> c = new HashMap<>();
      @Nullable
      protected ghq d;

      protected a(fdb $$0, SequencedMap<ghq, fdb> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fdi getBuffer(ghq $$0) {
         fcz $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.S()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fdb $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fcz($$2, $$0.O(), $$0.N());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fcz(this.a, $$0.O(), $$0.N());
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

         for (ghq $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(ghq $$0) {
         fcz $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(ghq $$0, fcz $$1) {
         fdd $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.T()) {
               fdb $$3 = this.b.getOrDefault($$0, this.a);
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
