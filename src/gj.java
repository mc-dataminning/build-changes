import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class gj implements gc {
   private final gi a;
   private final gi b;
   private final gi c;

   public gj(gi $$0, gi $$1, gi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eum a(ee $$0) {
      eum $$1 = $$0.d();
      return new eum(this.a.a($$1.c), this.b.a($$1.d), this.c.a($$1.e));
   }

   @Override
   public eul b(ee $$0) {
      eul $$1 = $$0.k();
      return new eul((float)this.a.a((double)$$1.i), (float)this.b.a((double)$$1.j));
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
      } else if (!($$0 instanceof gj $$1)) {
         return false;
      } else if (!this.a.equals($$1.a)) {
         return false;
      } else {
         return !this.b.equals($$1.b) ? false : this.c.equals($$1.c);
      }
   }

   public static gj a(StringReader $$0) throws CommandSyntaxException {
      int $$1 = $$0.getCursor();
      gi $$2 = gi.a($$0);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gi $$3 = gi.a($$0);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gi $$4 = gi.a($$0);
            return new gj($$2, $$3, $$4);
         } else {
            $$0.setCursor($$1);
            throw gh.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$1);
         throw gh.a.createWithContext($$0);
      }
   }

   public static gj a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
      int $$2 = $$0.getCursor();
      gi $$3 = gi.a($$0, $$1);
      if ($$0.canRead() && $$0.peek() == ' ') {
         $$0.skip();
         gi $$4 = gi.a($$0, false);
         if ($$0.canRead() && $$0.peek() == ' ') {
            $$0.skip();
            gi $$5 = gi.a($$0, $$1);
            return new gj($$3, $$4, $$5);
         } else {
            $$0.setCursor($$2);
            throw gh.a.createWithContext($$0);
         }
      } else {
         $$0.setCursor($$2);
         throw gh.a.createWithContext($$0);
      }
   }

   public static gj a(double $$0, double $$1, double $$2) {
      return new gj(new gi(false, $$0), new gi(false, $$1), new gi(false, $$2));
   }

   public static gj a(eul $$0) {
      return new gj(new gi(false, (double)$$0.i), new gi(false, (double)$$0.j), new gi(true, 0.0));
   }

   public static gj d() {
      return new gj(new gi(true, 0.0), new gi(true, 0.0), new gi(true, 0.0));
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }
}
