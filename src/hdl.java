import javax.annotation.Nullable;

public class hdl {
   private boolean a;
   @Nullable
   private hdf.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hdl(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hdg.a $$0) {
      if (this.c != null) {
         $$0.a(hdf.j, !this.c.equals("vanilla"));
      }

      $$0.a(hdf.k, this.a());
   }

   private hdf.c a() {
      gcl $$0 = fja.Q().S();
      if ($$0 != null && $$0.e()) {
         return hdf.c.a;
      } else {
         return fja.Q().U() ? hdf.c.b : hdf.c.c;
      }
   }

   public boolean a(hdc $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hdd.b, $$0x -> {
            $$0x.a(hdf.n, this.b);
            if (this.d != null) {
               $$0x.a(hdf.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(des $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hdf.b.e : hdf.b.a;
         case b -> hdf.b.b;
         case c -> hdf.b.c;
         case d -> hdf.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
