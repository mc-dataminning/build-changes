import javax.annotation.Nullable;

public class gvp {
   private boolean a;
   @Nullable
   private gvj.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gvp(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gvk.a $$0) {
      if (this.c != null) {
         $$0.a(gvj.j, !this.c.equals("vanilla"));
      }

      $$0.a(gvj.k, this.a());
   }

   private gvj.c a() {
      fzn $$0 = fgi.Q().S();
      if ($$0 != null && $$0.e()) {
         return gvj.c.a;
      } else {
         return fgi.Q().U() ? gvj.c.b : gvj.c.c;
      }
   }

   public boolean a(gvg $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gvh.b, $$0x -> {
            $$0x.a(gvj.n, this.b);
            if (this.d != null) {
               $$0x.a(gvj.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dcr $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gvj.b.e : gvj.b.a;
         case b -> gvj.b.b;
         case c -> gvj.b.c;
         case d -> gvj.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
