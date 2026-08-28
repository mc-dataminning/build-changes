import javax.annotation.Nullable;

public class hoj {
   private boolean a;
   @Nullable
   private hod.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hoj(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hoe.a $$0) {
      if (this.c != null) {
         $$0.a(hod.j, !this.c.equals("vanilla"));
      }

      $$0.a(hod.k, this.a());
   }

   private hod.c a() {
      gkg $$0 = fos.Q().S();
      if ($$0 != null && $$0.e()) {
         return hod.c.a;
      } else {
         return fos.Q().U() ? hod.c.b : hod.c.c;
      }
   }

   public boolean a(hoa $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hob.b, $$0x -> {
            $$0x.a(hod.n, this.b);
            if (this.d != null) {
               $$0x.a(hod.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dis $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hod.b.e : hod.b.a;
         case b -> hod.b.b;
         case c -> hod.b.c;
         case d -> hod.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
