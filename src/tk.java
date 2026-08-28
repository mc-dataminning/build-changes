import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tk implements tm, tn {
   static final tm a = Stream::empty;
   static final tn b = Stream::empty;
   private final tm c;
   private final tn d;
   private final ex e;

   @Override
   public Stream<jj> findTestPos() {
      return this.d.findTestPos();
   }

   public static tk.a a() {
      return new tk.a();
   }

   tk(ex $$0, tm $$1, tn $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ex b() {
      return this.e;
   }

   @Override
   public Stream<js.c<sp>> findTests() {
      return this.c.findTests();
   }

   public static class a {
      private final UnaryOperator<Supplier<Stream<js.c<sp>>>> a;
      private final UnaryOperator<Supplier<Stream<jj>>> b;

      public a() {
         this.a = $$0 -> $$0;
         this.b = $$0 -> $$0;
      }

      private a(UnaryOperator<Supplier<Stream<js.c<sp>>>> $$0, UnaryOperator<Supplier<Stream<jj>>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public tk.a a(int $$0) {
         return new tk.a(b($$0), b($$0));
      }

      private static <Q> UnaryOperator<Supplier<Stream<Q>>> b(int $$0) {
         return $$1 -> {
            List<Q> $$2 = new LinkedList<>();
            List<Q> $$3 = ((Stream)$$1.get()).toList();

            for (int $$4 = 0; $$4 < $$0; $$4++) {
               $$2.addAll($$3);
            }

            return $$2::stream;
         };
      }

      private tk a(ex $$0, tm $$1, tn $$2) {
         return new tk($$0, this.a.apply($$1::findTests)::get, this.b.apply($$2::findTestPos)::get);
      }

      public tk a(CommandContext<ex> $$0, int $$1) {
         ex $$2 = (ex)$$0.getSource();
         jj $$3 = jj.a((kc)$$2.d());
         return this.a($$2, tk.a, () -> tg.c($$3, $$1, $$2.e()));
      }

      public tk a(CommandContext<ex> $$0) {
         ex $$1 = (ex)$$0.getSource();
         jj $$2 = jj.a((kc)$$1.d());
         return this.a($$1, tk.a, () -> tg.b($$2, 15, $$1.e()).stream());
      }

      public tk b(CommandContext<ex> $$0) {
         ex $$1 = (ex)$$0.getSource();
         jj $$2 = jj.a((kc)$$1.d());
         return this.a($$1, tk.a, () -> tg.c($$2, 200, $$1.e()));
      }

      public tk c(CommandContext<ex> $$0) {
         ex $$1 = (ex)$$0.getSource();
         return this.a($$1, tk.a, () -> tg.a(jj.a((kc)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public tk a(CommandContext<ex> $$0, boolean $$1) {
         return this.a((ex)$$0.getSource(), () -> se.a().filter($$1x -> !$$1 || ((sp)$$1x.a()).h()), tk.b);
      }

      public tk a(CommandContext<ex> $$0, Collection<js.c<sp>> $$1) {
         return this.a((ex)$$0.getSource(), $$1::stream, tk.b);
      }

      public tk d(CommandContext<ex> $$0) {
         return this.a($$0, false);
      }
   }
}
