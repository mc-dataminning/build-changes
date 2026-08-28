import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public class sh extends ss {
   public static final MapCodec<sh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a(mi.ay).fieldOf("function").forGetter(sh::q), tl.a.forGetter(ss::n)).apply($$0, sh::new)
   );
   private final alj<Consumer<sq>> c;

   public sh(alj<Consumer<sq>> $$0, tl<jg<tm>> $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(sq $$0) {
      $$0.a().J_().c(this.c).map(jg.c::a).orElseThrow(() -> new IllegalStateException("Trying to access missing test function: " + this.c.a())).accept($$0);
   }

   private alj<Consumer<sq>> q() {
      return this.c;
   }

   @Override
   public MapCodec<sh> a() {
      return a;
   }

   @Override
   protected xq b() {
      return xc.c("test_instance.type.function");
   }

   @Override
   public xc c() {
      return this.o().b(this.a("test_instance.description.function", this.c.a().toString())).b(this.p());
   }
}
