import javax.annotation.Nullable;

public class gwh {
   private boolean a;
   @Nullable
   private gwb.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gwh(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gwc.a $$0) {
      if (this.c != null) {
         $$0.a(gwb.j, !this.c.equals("vanilla"));
      }

      $$0.a(gwb.k, this.a());
   }

   private gwb.c a() {
      gab $$0 = fgj.Q().S();
      if ($$0 != null && $$0.e()) {
         return gwb.c.a;
      } else {
         return fgj.Q().U() ? gwb.c.b : gwb.c.c;
      }
   }

   public boolean a(gvy $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gvz.b, $$0x -> {
            $$0x.a(gwb.n, this.b);
            if (this.d != null) {
               $$0x.a(gwb.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dbx $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gwb.b.e : gwb.b.a;
         case b -> gwb.b.b;
         case c -> gwb.b.c;
         case d -> gwb.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
