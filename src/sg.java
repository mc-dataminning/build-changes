import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public class sg extends sr {
   public static final MapCodec<sg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(mh.ay).fieldOf("function").forGetter(sg::q), tk.a.forGetter(sr::n)).apply($$0, sg::new)
   );
   private final alh<Consumer<sp>> c;

   public sg(alh<Consumer<sp>> $$0, tk<jf<tl>> $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(sp $$0) {
      $$0.a().J_().c(this.c).map(jf.c::a).orElseThrow(() -> new IllegalStateException("Trying to access missing test function: " + this.c.a())).accept($$0);
   }

   private alh<Consumer<sp>> q() {
      return this.c;
   }

   @Override
   public MapCodec<sg> a() {
      return a;
   }

   @Override
   protected xo b() {
      return xa.c("test_instance.type.function");
   }

   @Override
   public xa c() {
      return this.o().b(this.a("test_instance.description.function", this.c.a().toString())).b(this.p());
   }
}
