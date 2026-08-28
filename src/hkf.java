import javax.annotation.Nullable;

public class hkf {
   private boolean a;
   @Nullable
   private hjz.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hkf(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hka.a $$0) {
      if (this.c != null) {
         $$0.a(hjz.j, !this.c.equals("vanilla"));
      }

      $$0.a(hjz.k, this.a());
   }

   private hjz.c a() {
      ggn $$0 = flj.Q().S();
      if ($$0 != null && $$0.e()) {
         return hjz.c.a;
      } else {
         return flj.Q().U() ? hjz.c.b : hjz.c.c;
      }
   }

   public boolean a(hjw $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hjx.b, $$0x -> {
            $$0x.a(hjz.n, this.b);
            if (this.d != null) {
               $$0x.a(hjz.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dgf $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hjz.b.e : hjz.b.a;
         case b -> hjz.b.b;
         case c -> hjz.b.c;
         case d -> hjz.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
