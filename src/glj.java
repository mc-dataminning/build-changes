import javax.annotation.Nullable;

public class glj implements gms<glj> {
   public static final aiv a = new aiv("sounds", ".ogg");
   private final ajc b;
   private final blt c;
   private final blt d;
   private final int e;
   private final glj.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public glj(String $$0, blt $$1, blt $$2, int $$3, glj.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new ajc($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ajc a() {
      return this.b;
   }

   public ajc b() {
      return a.a(this.b);
   }

   public blt c() {
      return this.c;
   }

   public blt d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public glj a(awt $$0) {
      return this;
   }

   @Override
   public void a(gmn $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public glj.a f() {
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

      private a(String $$0) {
         this.c = $$0;
      }

      @Nullable
      public static glj.a a(String $$0) {
         for (glj.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
