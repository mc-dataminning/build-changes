import javax.annotation.Nullable;

public class how implements hqh<how> {
   public static final ald a = new ald("sounds", ".ogg");
   private final alk b;
   private final bub c;
   private final bub d;
   private final int e;
   private final how.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public how(alk $$0, bub $$1, bub $$2, int $$3, how.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public alk a() {
      return this.b;
   }

   public alk b() {
      return a.a(this.b);
   }

   public bub c() {
      return this.c;
   }

   public bub d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public how a(azz $$0) {
      return this;
   }

   @Override
   public void a(hqc $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public how.a f() {
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
      public static how.a a(String $$0) {
         for (how.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
