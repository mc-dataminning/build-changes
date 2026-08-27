import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ts<T> implements tn, tv {
   static final tv a = Stream::empty;
   static final tn b = Stream::empty;
   private final tv c;
   private final tn d;
   private final ee e;
   private final Function<ts<T>, T> f;

   @Override
   public Stream<io> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   ts(ee $$0, Function<ts<T>, T> $$1, tv $$2, tn $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ee a() {
      return this.e;
   }

   @Override
   public Stream<tt> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<ts<T>, T> a;
      private final UnaryOperator<Supplier<Stream<tt>>> b;
      private final UnaryOperator<Supplier<Stream<io>>> c;

      public a(Function<ts<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<ts<T>, T> $$0, UnaryOperator<Supplier<Stream<tt>>> $$1, UnaryOperator<Supplier<Stream<io>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ts.a<T> a(int $$0) {
         return new ts.a<>(this.a, b($$0), b($$0));
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

      private T a(ee $$0, tv $$1, tn $$2) {
         return new ts<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ee> $$0, int $$1) {
         ee $$2 = (ee)$$0.getSource();
         return this.a($$2, ts.a, () -> tp.a($$1, $$2.d(), $$2.e()));
      }

      public T a(CommandContext<ee> $$0) {
         ee $$1 = (ee)$$0.getSource();
         io $$2 = io.a($$1.d());
         return this.a($$1, ts.a, () -> tp.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ee> $$0) {
         ee $$1 = (ee)$$0.getSource();
         io $$2 = io.a($$1.d());
         return this.a($$1, ts.a, () -> tp.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ee> $$0) {
         ee $$1 = (ee)$$0.getSource();
         return this.a($$1, ts.a, () -> tp.a(io.a($$1.d()), $$1.i().K(), $$1.e()));
      }

      public T d(CommandContext<ee> $$0) {
         return this.a((ee)$$0.getSource(), () -> tb.a().stream().filter($$0x -> !$$0x.i()), ts.b);
      }

      public T a(CommandContext<ee> $$0, String $$1) {
         return this.a((ee)$$0.getSource(), () -> tb.a($$1).filter($$0xx -> !$$0xx.i()), ts.b);
      }

      public T a(CommandContext<ee> $$0, boolean $$1) {
         return this.a((ee)$$0.getSource(), () -> tb.c().filter($$1x -> !$$1 || $$1x.h()), ts.b);
      }

      public T b(CommandContext<ee> $$0, String $$1) {
         return this.a((ee)$$0.getSource(), () -> Stream.of(tu.a($$0, $$1)), ts.b);
      }

      public T e(CommandContext<ee> $$0) {
         return this.a($$0, false);
      }
   }
}
