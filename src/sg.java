import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public class sg extends sr {
   public static final MapCodec<sg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.ay).fieldOf("function").forGetter(sg::q), tk.a.forGetter(sr::n)).apply($$0, sg::new)
   );
   private final alf<Consumer<sp>> c;

   public sg(alf<Consumer<sp>> $$0, tk<je<tl>> $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public void a(sp $$0) {
      $$0.a().F_().c(this.c).map(je.c::a).orElseThrow(() -> new IllegalStateException("Trying to access missing test function: " + this.c.a())).accept($$0);
   }

   private alf<Consumer<sp>> q() {
      return this.c;
   }

   @Override
   public MapCodec<sg> a() {
      return a;
   }

   @Override
   protected xm b() {
      return wy.c("test_instance.type.function");
   }

   @Override
   public wy c() {
      return this.o().b(this.a("test_instance.description.function", this.c.a().toString())).b(this.p());
   }
}
