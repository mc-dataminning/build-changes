import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gi implements gb {
   private final gh a;
   private final gh b;
   private final gh c;

   public gi(gh $$0, gh $$1, gh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etp a(ed $$0) {
      etp $$1 = $$0.d();
      return new etp(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public eto b(ed $$0) {
      eto $$1 = $$0.k();
      return new eto((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
   }

   @Override
   public boolean a() {
      return this.a.a();
   }

   @Override
   public boolean b() {
      return this.b.a();
   }

   @Override
   public boolean c() {
      return this.c.a();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if (!($$0 instanceof gi $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gi a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gh $$2 = gh.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gh $$3 = gh.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gh $$4 = gh.a($$0);
            return new gi($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gg.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gg.a.createWithContext($$0);
      }
   }

   public static gi a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gh $$3 = gh.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gh $$4 = gh.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gh $$5 = gh.a($$0, $$1);
            return new gi($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gg.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gg.a.createWithContext($$0);
      }
   }

   public static gi a(double $$0, double $$1, double $$2) {
      return new gi(new gh(false, $$0), new gh(false, $$1), new gh(false, $$2));
   }

   public static gi a(eto $$0) {
      return new gi(new gh(false, (double)$$0.i), new gh(false, (double)$$0.j), new gh(true, 0.0));
   }

   public static gi d() {
      return new gi(new gh(true, 0.0), new gh(true, 0.0), new gh(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
