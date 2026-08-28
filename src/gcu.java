import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class gcu implements boq {
   private final gdl a;
   private final Set<boo> b = new ObjectOpenHashSet();
   private final bow c = new bow();

   public gcu(LongSupplier $$0, gdl $$1) {
      this.a = $$1;
      this.b.add(box.a($$0));
      this.a();
   }

   private void a() {
      this.b.addAll(box.a());
      this.b.add(boo.a("totalChunks", bon.f, this.a, gdl::i));
      this.b.add(boo.a("renderedChunks", bon.f, this.a, gdl::k));
      this.b.add(boo.a("lastViewDistance", bon.f, this.a, gdl::j));
      ggn $$0 = this.a.h();
      this.b.add(boo.a("toUpload", bon.g, $$0, ggn::c));
      this.b.add(boo.a("freeBufferCount", bon.g, $$0, ggn::d));
      this.b.add(boo.a("toBatchCount", bon.g, $$0, ggn::b));
      if (ezq.a().isPresent()) {
         this.b.add(boo.a("gpuUtilization", bon.i, ffe.Q(), ffe::v));
      }
   }

   @Override
   public Set<boo> a(Supplier<bnf> $$0) {
      this.b.addAll(this.c.a($$0));
      return this.b;
   }
}
