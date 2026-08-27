import javax.annotation.Nullable;

public class gnh {
   private boolean a;
   @Nullable
   private gnb.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gnh(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gnc.a $$0) {
      if (this.c != null) {
         $$0.a(gnb.j, !this.c.equals("vanilla"));
      }

      $$0.a(gnb.k, this.a());
   }

   private gnb.c a() {
      frn $$0 = eyk.P().R();
      if ($$0 != null && $$0.e()) {
         return gnb.c.a;
      } else {
         return eyk.P().T() ? gnb.c.b : gnb.c.c;
      }
   }

   public boolean a(gmy $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gmz.b, $$0x -> {
            $$0x.a(gnb.n, this.b);
            if (this.d != null) {
               $$0x.a(gnb.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cwb $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gnb.b.e : gnb.b.a;
         case b -> gnb.b.b;
         case c -> gnb.b.c;
         case d -> gnb.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
