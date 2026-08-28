import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.Object2ObjectSortedMaps;
import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import javax.annotation.Nullable;

public interface gqa {
   static gqa.a a(fjg $$0) {
      return a(Object2ObjectSortedMaps.emptyMap(), $$0);
   }

   static gqa.a a(SequencedMap<gqk, fjg> $$0, fjg $$1) {
      return new gqa.a($$1, $$0);
   }

   fjn getBuffer(gqk var1);

   public static class a implements gqa {
      protected final fjg a;
      protected final SequencedMap<gqk, fjg> b;
      protected final Map<gqk, fjf> c = new HashMap<>();
      @Nullable
      protected gqk d;

      protected a(fjg $$0, SequencedMap<gqk, fjg> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fjn getBuffer(gqk $$0) {
         fjf $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.Y()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            fjg $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fjf($$2, $$0.U(), $$0.T());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fjf(this.a, $$0.U(), $$0.T());
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

         for (gqk $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(gqk $$0) {
         fjf $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gqk $$0, fjf $$1) {
         fji $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.Z()) {
               fjg $$3 = this.b.getOrDefault($$0, this.a);
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
