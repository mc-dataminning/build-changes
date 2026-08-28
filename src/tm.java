import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tm implements to, tp {
   static final to a = Stream::empty;
   static final tp b = Stream::empty;
   private final to c;
   private final tp d;
   private final ei e;

   @Override
   public Stream<iu> findTestPos() {
      return this.d.findTestPos();
   }

   public static tm.a a() {
      return new tm.a();
   }

   tm(ei $$0, to $$1, tp $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ei b() {
      return this.e;
   }

   @Override
   public Stream<je.c<sr>> findTests() {
      return this.c.findTests();
   }

   public static class a {
      private final UnaryOperator<Supplier<Stream<je.c<sr>>>> a;
      private final UnaryOperator<Supplier<Stream<iu>>> b;

      public a() {
         this.a = $$0 -> $$0;
         this.b = $$0 -> $$0;
      }

      private a(UnaryOperator<Supplier<Stream<je.c<sr>>>> $$0, UnaryOperator<Supplier<Stream<iu>>> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public tm.a a(int $$0) {
         return new tm.a(b($$0), b($$0));
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

      private tm a(ei $$0, to $$1, tp $$2) {
         return new tm($$0, this.a.apply($$1::findTests)::get, this.b.apply($$2::findTestPos)::get);
      }

      public tm a(CommandContext<ei> $$0, int $$1) {
         ei $$2 = (ei)$$0.getSource();
         iu $$3 = iu.a((jo)$$2.d());
         return this.a($$2, tm.a, () -> ti.c($$3, $$1, $$2.e()));
      }

      public tm a(CommandContext<ei> $$0) {
         ei $$1 = (ei)$$0.getSource();
         iu $$2 = iu.a((jo)$$1.d());
         return this.a($$1, tm.a, () -> ti.b($$2, 15, $$1.e()).stream());
      }

      public tm b(CommandContext<ei> $$0) {
         ei $$1 = (ei)$$0.getSource();
         iu $$2 = iu.a((jo)$$1.d());
         return this.a($$1, tm.a, () -> ti.c($$2, 200, $$1.e()));
      }

      public tm c(CommandContext<ei> $$0) {
         ei $$1 = (ei)$$0.getSource();
         return this.a($$1, tm.a, () -> ti.a(iu.a((jo)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public tm a(CommandContext<ei> $$0, boolean $$1) {
         return this.a((ei)$$0.getSource(), () -> sf.a().filter($$1x -> !$$1 || ((sr)$$1x.a()).h()), tm.b);
      }

      public tm a(CommandContext<ei> $$0, Collection<je.c<sr>> $$1) {
         return this.a((ei)$$0.getSource(), $$1::stream, tm.b);
      }

      public tm d(CommandContext<ei> $$0) {
         return this.a($$0, false);
      }
   }
}
