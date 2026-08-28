import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public interface get {
   static get.a a(faz $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static get.a a(Map<gfb, faz> $$0, faz $$1) {
      return new get.a($$1, $$0);
   }

   fbg getBuffer(gfb var1);

   public static class a implements get {
      protected final faz a;
      protected final Map<gfb, faz> b;
      protected final Map<gfb, fax> c = new HashMap<>();
      @Nullable
      protected gfb d;

      protected a(faz $$0, Map<gfb, faz> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public fbg getBuffer(gfb $$0) {
         fax $$1 = this.c.get($$0);
         if ($$1 != null && !$$0.M()) {
            this.a($$0, $$1);
            $$1 = null;
         }

         if ($$1 != null) {
            return $$1;
         } else {
            faz $$2 = this.b.get($$0);
            if ($$2 != null) {
               $$1 = new fax($$2, $$0.I(), $$0.H());
            } else {
               if (this.d != null) {
                  this.a(this.d);
               }

               $$1 = new fax(this.a, $$0.I(), $$0.H());
               this.d = $$0;
            }

            this.c.put($$0, $$1);
            return $$1;
         }
      }

      public void a() {
         if (this.d != null && !this.b.containsKey(this.d)) {
            this.a(this.d);
         }

         this.d = null;
      }

      public void b() {
         this.c.forEach(this::a);
         this.c.clear();
      }

      public void a(gfb $$0) {
         fax $$1 = this.c.remove($$0);
         if ($$1 != null) {
            this.a($$0, $$1);
         }
      }

      private void a(gfb $$0, fax $$1) {
         fbb $$2 = $$1.a();
         if ($$2 != null) {
            if ($$0.N()) {
               faz $$3 = this.b.getOrDefault($$0, this.a);
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
