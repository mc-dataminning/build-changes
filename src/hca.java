import javax.annotation.Nullable;

public class hca {
   private boolean a;
   @Nullable
   private hbu.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hca(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hbv.a $$0) {
      if (this.c != null) {
         $$0.a(hbu.j, !this.c.equals("vanilla"));
      }

      $$0.a(hbu.k, this.a());
   }

   private hbu.c a() {
      gbl $$0 = fib.Q().S();
      if ($$0 != null && $$0.e()) {
         return hbu.c.a;
      } else {
         return fib.Q().U() ? hbu.c.b : hbu.c.c;
      }
   }

   public boolean a(hbr $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hbs.b, $$0x -> {
            $$0x.a(hbu.n, this.b);
            if (this.d != null) {
               $$0x.a(hbu.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(ddp $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hbu.b.e : hbu.b.a;
         case b -> hbu.b.b;
         case c -> hbu.b.c;
         case d -> hbu.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
