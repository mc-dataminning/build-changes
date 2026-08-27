import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ir implements it {
   public static final it.a<ir> a = new it.a<ir>() {
      public ir a(iu<ir> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         fy.a $$2 = fy.a(jb.i.p(), $$1);
         cjl $$3 = new fx($$2.a(), $$2.b()).a(1, false);
         return new ir($$0, $$3);
      }

      public ir a(iu<ir> $$0, so $$1) {
         return new ir($$0, $$1.r());
      }
   };
   private final iu<ir> b;
   private final cjl c;

   public static Codec<ir> a(iu<ir> $$0) {
      return cjl.a.xmap($$1 -> new ir($$0, $$1), $$0x -> $$0x.c);
   }

   public ir(iu<ir> $$0, cjl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return jb.k.b(this.b()) + " " + new fx(this.c.e(), this.c.v()).b();
   }

   @Override
   public iu<ir> b() {
      return this.b;
   }

   public cjl c() {
      return this.c;
   }
}
