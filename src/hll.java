import javax.annotation.Nullable;

public class hll {
   private boolean a;
   @Nullable
   private hlf.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hll(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hlg.a $$0) {
      if (this.c != null) {
         $$0.a(hlf.j, !this.c.equals("vanilla"));
      }

      $$0.a(hlf.k, this.a());
   }

   private hlf.c a() {
      ghn $$0 = fmg.Q().S();
      if ($$0 != null && $$0.e()) {
         return hlf.c.a;
      } else {
         return fmg.Q().U() ? hlf.c.b : hlf.c.c;
      }
   }

   public boolean a(hlc $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hld.b, $$0x -> {
            $$0x.a(hlf.n, this.b);
            if (this.d != null) {
               $$0x.a(hlf.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dgw $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hlf.b.e : hlf.b.a;
         case b -> hlf.b.b;
         case c -> hlf.b.c;
         case d -> hlf.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
