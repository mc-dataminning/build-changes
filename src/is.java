import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class is implements iu {
   public static final iu.a<is> a = new iu.a<is>() {
      public is a(iv<is> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         fx.a $$2 = fx.a(jc.i.p(), $$1);
         ciw $$3 = new fw($$2.a(), $$2.b()).a(1, false);
         return new is($$0, $$3);
      }

      public is a(iv<is> $$0, sh $$1) {
         return new is($$0, $$1.q());
      }
   };
   private final iv<is> b;
   private final ciw c;

   public static Codec<is> a(iv<is> $$0) {
      return ciw.a.xmap($$1 -> new is($$0, $$1), $$0x -> $$0x.c);
   }

   public is(iv<is> $$0, ciw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return jc.k.b(this.b()) + " " + new fw(this.c.e(), this.c.v()).b();
   }

   @Override
   public iv<is> b() {
      return this.b;
   }

   public ciw c() {
      return this.c;
   }
}
