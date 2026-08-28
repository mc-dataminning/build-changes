import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface grn {
   static grn.a a(fla $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static grn.a a(SequencedMap<gry, fla> $$0, fla $$1) {
      return new grn.a($$1, $$0);
   }

   flg getBuffer(gry var1);

   public static class a implements grn {
      protected final fla a;
      protected final SequencedMap<gry, fla> b;
      protected final Map<gry, fkz> c = new HashMap<>();
      @Nullable
      protected gry d;

      protected a(fla $$0, SequencedMap<gry, fla> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public flg getBuffer(gry $$0) {
         fkz $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.U()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fla $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fkz($$2, $$0.Q(), $$0.P());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fkz(this.a, $$0.Q(), $$0.P());
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

         for (gry $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gry $$0) {
         fkz $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gry $$0, fkz $$1) {
         flc $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.V()) {
               fla $$3 = this.b.getOrDefault($$0, this.a);
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
