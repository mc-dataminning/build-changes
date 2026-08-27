import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class ir implements it {
   public static final it.a<ir> a = new it.a<ir>() {
      public ir a(iu<ir> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         fw.a $$2 = fw.a(jb.i.p(), $$1);
         cfz $$3 = new fv($$2.a(), $$2.b()).a(1, false);
         return new ir($$0, $$3);
      }

      public ir a(iu<ir> $$0, sf $$1) {
         return new ir($$0, $$1.r());
      }
   };
   private final iu<ir> b;
   private final cfz c;

   public static Codec<ir> a(iu<ir> $$0) {
      return cfz.a.xmap($$1 -> new ir($$0, $$1), $$0x -> $$0x.c);
   }

   public ir(iu<ir> $$0, cfz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return jb.k.b(this.b()) + " " + new fv(this.c.e(), this.c.v()).b();
   }

   @Override
   public iu<ir> b() {
      return this.b;
   }

   public cfz c() {
      return this.c;
   }
}
