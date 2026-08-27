import javax.annotation.Nullable;

public class gji {
   private boolean a;
   @Nullable
   private gjc.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gji(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gjd.a $$0) {
      if (this.c != null) {
         $$0.a(gjc.j, !this.c.equals("vanilla"));
      }

      $$0.a(gjc.k, this.a());
   }

   private gjc.c a() {
      fnv $$0 = eva.N().P();
      if ($$0 != null && $$0.e()) {
         return gjc.c.a;
      } else {
         return eva.N().R() ? gjc.c.b : gjc.c.c;
      }
   }

   public boolean a(giz $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gja.b, $$0x -> {
            $$0x.a(gjc.n, this.b);
            if (this.d != null) {
               $$0x.a(gjc.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(ctf $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gjc.b.e : gjc.b.a;
         case b -> gjc.b.b;
         case c -> gjc.b.c;
         case d -> gjc.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
