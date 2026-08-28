import javax.annotation.Nullable;

public class hff implements hgp<hff> {
   public static final als a = new als("sounds", ".ogg");
   private final alz b;
   private final bsr c;
   private final bsr d;
   private final int e;
   private final hff.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public hff(alz $$0, bsr $$1, bsr $$2, int $$3, hff.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alz a() {
      return this.b;
   }

   public alz b() {
      return a.a(this.b);
   }

   public bsr c() {
      return this.c;
   }

   public bsr d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public hff a(bam $$0) {
      return this;
   }

   @Override
   public void a(hgk $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public hff.a f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public int i() {
      return this.i;
   }

   @Override
   public String toString() {
      return "Sound[" + this.b + "]";
   }

   public static enum a {
      a("file"),
      b("event");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      @Nullable
      public static hff.a a(String $$0) {
         for (hff.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
