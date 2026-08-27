import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class io implements iu {
   public static final iu.a<io> a = new iu.a<io>() {
      public io a(iv<io> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new io($$0, fh.a(jc.f.p(), $$1, false).a());
      }

      public io a(iv<io> $$0, sh $$1) {
         return new io($$0, $$1.a(csk.o));
      }
   };
   private final iv<io> b;
   private final dey c;

   public static Codec<io> a(iv<io> $$0) {
      return dey.b.xmap($$1 -> new io($$0, $$1), $$0x -> $$0x.c);
   }

   public io(iv<io> $$0, dey $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(sh $$0) {
      $$0.a(csk.o, this.c);
   }

   @Override
   public String a() {
      return jc.k.b(this.b()) + " " + fh.a(this.c);
   }

   @Override
   public iv<io> b() {
      return this.b;
   }

   public dey c() {
      return this.c;
   }
}
