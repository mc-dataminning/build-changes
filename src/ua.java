import com.mojang.brigadier.context.CommandContext;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ua<T> implements tv, ud {
   static final ud a = Stream::empty;
   static final tv b = Stream::empty;
   private final ud c;
   private final tv d;
   private final ew e;
   private final Function<ua<T>, T> f;

   @Override
   public Stream<jh> findStructureBlockPos() {
      return this.d.findStructureBlockPos();
   }

   ua(ew $$0, Function<ua<T>, T> $$1, ud $$2, tv $$3) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   T b() {
      return this.f.apply(this);
   }

   public ew a() {
      return this.e;
   }

   @Override
   public Stream<ub> findTestFunctions() {
      return this.c.findTestFunctions();
   }

   public static class a<T> {
      private final Function<ua<T>, T> a;
      private final UnaryOperator<Supplier<Stream<ub>>> b;
      private final UnaryOperator<Supplier<Stream<jh>>> c;

      public a(Function<ua<T>, T> $$0) {
         this.a = $$0;
         this.b = $$0x -> $$0x;
         this.c = $$0x -> $$0x;
      }

      private a(Function<ua<T>, T> $$0, UnaryOperator<Supplier<Stream<ub>>> $$1, UnaryOperator<Supplier<Stream<jh>>> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ua.a<T> a(int $$0) {
         return new ua.a<>(this.a, b($$0), b($$0));
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

      private T a(ew $$0, ud $$1, tv $$2) {
         return new ua<>($$0, this.a, this.b.apply($$1::findTestFunctions)::get, this.c.apply($$2::findStructureBlockPos)::get).b();
      }

      public T a(CommandContext<ew> $$0, int $$1) {
         ew $$2 = (ew)$$0.getSource();
         jh $$3 = jh.a((ka)$$2.d());
         return this.a($$2, ua.a, () -> tx.c($$3, $$1, $$2.e()));
      }

      public T a(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         jh $$2 = jh.a((ka)$$1.d());
         return this.a($$1, ua.a, () -> tx.b($$2, 15, $$1.e()).stream());
      }

      public T b(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         jh $$2 = jh.a((ka)$$1.d());
         return this.a($$1, ua.a, () -> tx.c($$2, 200, $$1.e()));
      }

      public T c(CommandContext<ew> $$0) {
         ew $$1 = (ew)$$0.getSource();
         return this.a($$1, ua.a, () -> tx.a(jh.a((ka)$$1.d()), $$1.i().L(), $$1.e()));
      }

      public T d(CommandContext<ew> $$0) {
         return this.a((ew)$$0.getSource(), () -> tj.a().stream().filter($$0x -> !$$0x.i()), ua.b);
      }

      public T a(CommandContext<ew> $$0, String $$1) {
         return this.a((ew)$$0.getSource(), () -> tj.a($$1).filter($$0xx -> !$$0xx.i()), ua.b);
      }

      public T a(CommandContext<ew> $$0, boolean $$1) {
         return this.a((ew)$$0.getSource(), () -> tj.c().filter($$1x -> !$$1 || $$1x.h()), ua.b);
      }

      public T b(CommandContext<ew> $$0, String $$1) {
         return this.a((ew)$$0.getSource(), () -> Stream.of(uc.a($$0, $$1)), ua.b);
      }

      public T c(CommandContext<ew> $$0, String $$1) {
         ew $$2 = (ew)$$0.getSource();
         jh $$3 = jh.a((ka)$$2.d());
         return this.a($$2, ua.a, () -> tx.a($$3, 1024, $$2.e(), $$1));
      }

      public T e(CommandContext<ew> $$0) {
         return this.a($$0, false);
      }
   }
}
