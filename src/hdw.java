import javax.annotation.Nullable;

public class hdw {
   private boolean a;
   @Nullable
   private hdq.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hdw(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hdr.a $$0) {
      if (this.c != null) {
         $$0.a(hdq.j, !this.c.equals("vanilla"));
      }

      $$0.a(hdq.k, this.a());
   }

   private hdq.c a() {
      gcw $$0 = fji.Q().S();
      if ($$0 != null && $$0.e()) {
         return hdq.c.a;
      } else {
         return fji.Q().U() ? hdq.c.b : hdq.c.c;
      }
   }

   public boolean a(hdn $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hdo.b, $$0x -> {
            $$0x.a(hdq.n, this.b);
            if (this.d != null) {
               $$0x.a(hdq.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dey $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hdq.b.e : hdq.b.a;
         case b -> hdq.b.b;
         case c -> hdq.b.c;
         case d -> hdq.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
