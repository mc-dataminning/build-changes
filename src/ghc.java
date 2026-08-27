import javax.annotation.Nullable;

public class ghc {
   private boolean a;
   @Nullable
   private ggw.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public ghc(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(ggx.a $$0) {
      if (this.c != null) {
         $$0.a(ggw.j, !this.c.equals("vanilla"));
      }

      $$0.a(ggw.k, this.a());
   }

   private ggw.c a() {
      flz $$0 = eti.N().P();
      if ($$0 != null && $$0.e()) {
         return ggw.c.a;
      } else {
         return eti.N().R() ? ggw.c.b : ggw.c.c;
      }
   }

   public boolean a(ggt $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(ggu.b, $$0x -> {
            $$0x.a(ggw.n, this.b);
            if (this.d != null) {
               $$0x.a(ggw.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(csc $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? ggw.b.e : ggw.b.a;
         case b -> ggw.b.b;
         case c -> ggw.b.c;
         case d -> ggw.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
