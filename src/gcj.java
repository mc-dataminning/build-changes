import javax.annotation.Nullable;

public class gcj implements gds<gcj> {
   public static final aeq a = new aeq("sounds", ".ogg");
   private final aex b;
   private final bgg c;
   private final bgg d;
   private final int e;
   private final gcj.a f;
   private final boolean g;
   private final boolean h;
   private final int i;

   public gcj(String $$0, bgg $$1, bgg $$2, int $$3, gcj.a $$4, boolean $$5, boolean $$6, int $$7) {
      this.b = new aex($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public aex a() {
      return this.b;
   }

   public aex b() {
      return a.a(this.b);
   }

   public bgg c() {
      return this.c;
   }

   public bgg d() {
      return this.d;
   }

   @Override
   public int e() {
      return this.e;
   }

   public gcj a(asc $$0) {
      return this;
   }

   @Override
   public void a(gdn $$0) {
      if (this.h) {
         $$0.a(this);
      }
   }

   public gcj.a f() {
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
      public static gcj.a a(String $$0) {
         for (gcj.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         return null;
      }
   }
}
