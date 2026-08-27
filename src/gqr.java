import javax.annotation.Nullable;

public class gqr {
   private boolean a;
   @Nullable
   private gql.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public gqr(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(gqm.a $$0) {
      if (this.c != null) {
         $$0.a(gql.j, !this.c.equals("vanilla"));
      }

      $$0.a(gql.k, this.a());
   }

   private gql.c a() {
      fuv $$0 = fbp.Q().S();
      if ($$0 != null && $$0.e()) {
         return gql.c.a;
      } else {
         return fbp.Q().U() ? gql.c.b : gql.c.c;
      }
   }

   public boolean a(gqi $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gqj.b, $$0x -> {
            $$0x.a(gql.n, this.b);
            if (this.d != null) {
               $$0x.a(gql.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(cyu $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gql.b.e : gql.b.a;
         case b -> gql.b.b;
         case c -> gql.b.c;
         case d -> gql.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
