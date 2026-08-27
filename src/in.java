import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class in implements it {
   public static final it.a<in> a = new it.a<in>() {
      public in a(iu<in> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         return new in($$0, fg.a(jb.f.p(), $$1, false).a());
      }

      public in a(iu<in> $$0, sf $$1) {
         return new in($$0, $$1.a(cpn.o));
      }
   };
   private final iu<in> b;
   private final dcb c;

   public static Codec<in> a(iu<in> $$0) {
      return dcb.b.xmap($$1 -> new in($$0, $$1), $$0x -> $$0x.c);
   }

   public in(iu<in> $$0, dcb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(sf $$0) {
      $$0.a(cpn.o, this.c);
   }

   @Override
   public String a() {
      return jb.k.b(this.b()) + " " + fg.a(this.c);
   }

   @Override
   public iu<in> b() {
      return this.b;
   }

   public dcb c() {
      return this.c;
   }
}
