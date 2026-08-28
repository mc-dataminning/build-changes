import javax.annotation.Nullable;

public class guo {
   private boolean a;
   @Nullable
   private gui.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public guo(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(guj.a $$0) {
      if (this.c != null) {
         $$0.a(gui.j, !this.c.equals("vanilla"));
      }

      $$0.a(gui.k, this.a());
   }

   private gui.c a() {
      fyl $$0 = ffh.Q().S();
      if ($$0 != null && $$0.e()) {
         return gui.c.a;
      } else {
         return ffh.Q().U() ? gui.c.b : gui.c.c;
      }
   }

   public boolean a(guf $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(gug.b, $$0x -> {
            $$0x.a(gui.n, this.b);
            if (this.d != null) {
               $$0x.a(gui.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dbx $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? gui.b.e : gui.b.a;
         case b -> gui.b.b;
         case c -> gui.b.c;
         case d -> gui.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
