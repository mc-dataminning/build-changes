import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class tq<T> implements tl, tt {
   static final tt a = Stream::empty;
   static final tl b = Stream::empty;
   private final tt c;
   private final tl d;
   private final et e;
   private final Function<tq<T>, T> f;

   @Override
   public Stream<jd> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   tq(et $$0, Function<tq<T>, T> $$1, tt $$2, tl $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public et a() {
      return this.e;
   }

   @Override
   public Stream<tr> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<tq<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tr>>> b;
      private final UnaryOperator<Supplier<Stream<jd>>> c;

      public a(Function<tq<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<tq<T>, T> $$0, UnaryOperator<Supplier<Stream<tr>>> $$1, UnaryOperator<Supplier<Stream<jd>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public tq.a<T> a(int $$0) {
         return new tq.a<>(this.a, b($$0), b($$0));
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

      private T a(et $$0, tt $$1, tl $$2) {
         return new tq<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<et> $$0, int $$1) {
         et $$2 = (et)$$0.getSource();
         jd $$3 = jd.a((jw)$$2.d());
         return this.a($$2, tq.a, () -> tn.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<et> $$0) {
         et $$1 = (et)$$0.getSource();
         jd $$2 = jd.a((jw)$$1.d());
         return this.a($$1, tq.a, () -> tn.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<et> $$0) {
         et $$1 = (et)$$0.getSource();
         jd $$2 = jd.a((jw)$$1.d());
         return this.a($$1, tq.a, () -> tn.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<et> $$0) {
         et $$1 = (et)$$0.getSource();
         return this.a($$1, tq.a, () -> tn.a(jd.a((jw)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public T d(CommandContext<et> $$0) {
         return this.a((et)$$0.getSource(), () -> sz.a().stream().filter($$0x -> !$$0x.i()), tq.b);
      }

      public T a(CommandContext<et> $$0, String $$1) {
         return this.a((et)$$0.getSource(), () -> sz.a($$1).filter($$0xx -> !$$0xx.i()), tq.b);
      }

      public T a(CommandContext<et> $$0, boolean $$1) {
         return this.a((et)$$0.getSource(), () -> sz.c().filter($$1x -> !$$1 || $$1x.h()), tq.b);
      }

      public T b(CommandContext<et> $$0, String $$1) {
         return this.a((et)$$0.getSource(), () -> Stream.of(ts.a($$0, $$1)), tq.b);
      }

      public T c(CommandContext<et> $$0, String $$1) {
         et $$2 = (et)$$0.getSource();
         jd $$3 = jd.a((jw)$$2.d());
         return this.a($$2, tq.a, () -> tn.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<et> $$0) {
         return this.a($$0, false);
      }
   }
}
