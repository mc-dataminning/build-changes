import javax.annotation.Nullable;

public class hqu {
   private boolean a;
   @Nullable
   private hqo.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hqu(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hqp.a $$0) {
      if (this.c != null) {
         $$0.a(hqo.j, !this.c.equals("vanilla"));
      }

      $$0.a(hqo.k, this.a());
   }

   private hqo.c a() {
      gmq $$0 = frd.Q().S();
      if ($$0 != null && $$0.e()) {
         return hqo.c.a;
      } else {
         return frd.Q().U() ? hqo.c.b : hqo.c.c;
      }
   }

   public boolean a(hql $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hqm.b, $$0x -> {
            $$0x.a(hqo.n, this.b);
            if (this.d != null) {
               $$0x.a(hqo.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dju $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hqo.b.e : hqo.b.a;
         case b -> hqo.b.b;
         case c -> hqo.b.c;
         case d -> hqo.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
