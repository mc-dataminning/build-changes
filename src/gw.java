import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gw extends bqj<gw.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xa.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xa.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xa.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xa.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xa.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final ali h = ali.b("count");
   static final Map<ali, gw.a> i = Stream.of(new gw.a(h, $$0 -> true, cw.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(gw.a::a, $$0 -> (gw.a)$$0));
   static final Map<ali, gw.c> j = Stream.of(new gw.c(h, cw.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(gw.c::a, $$0 -> (gw.c)$$0));

   public gw(ef $$0) {
      super(gr.a(new gw.b($$0)).a($$0x -> ag.a($$0x)::test));
   }

   public static gw a(ef $$0) {
      return new gw($$0);
   }

   public static gw.d a(CommandContext<ej> $$0, String $$1) {
      return (gw.d)$$0.getArgument($$1, gw.d.class);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(ali a, Predicate<czy> b, Decoder<? extends Predicate<czy>> c) {

      public static <T> gw.a a(ImmutableStringReader $$0, ali $$1, kj<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw gw.d.createWithContext($$0, $$1);
         } else {
            return new gw.a($$1, $$1x -> $$1x.c($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<czy> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<czy>> $$2 = this.c.parse($$1);
         return (Predicate<czy>)$$2.getOrThrow($$1x -> gw.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gr.b<Predicate<czy>, gw.a, gw.c> {
      private final jh.a a;
      private final jh.b<czu> b;
      private final jh.b<kj<?>> c;
      private final jh.b<kt.b<?>> d;

      b(jh.a $$0) {
         this.a = $$0;
         this.b = $$0.e(mh.K);
         this.c = $$0.e(mh.r);
         this.d = $$0.e(mh.q);
      }

      public Predicate<czy> e(ImmutableStringReader $$0, ali $$1) throws CommandSyntaxException {
         jf.c<czu> $$2 = this.b.a(alh.a(mh.K, $$1)).orElseThrow(() -> gw.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<czy> f(ImmutableStringReader $$0, ali $$1) throws CommandSyntaxException {
         jj<czu> $$2 = this.b.a(axt.a(mh.K, $$1)).orElseThrow(() -> gw.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public gw.a g(ImmutableStringReader $$0, ali $$1) throws CommandSyntaxException {
         gw.a $$2 = gw.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kj<?> $$3 = this.c.a(alh.a(mh.r, $$1)).map(jf::a).orElseThrow(() -> gw.d.createWithContext($$0, $$1));
            return gw.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<czy> a(ImmutableStringReader $$0, gw.a $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, alg.a($$2, this.a));
      }

      public Predicate<czy> a(ImmutableStringReader $$0, gw.a $$1) {
         return $$1.b;
      }

      public gw.c h(ImmutableStringReader $$0, ali $$1) throws CommandSyntaxException {
         gw.c $$2 = gw.j.get($$1);
         return $$2 != null ? $$2 : this.d.a(alh.a(mh.q, $$1)).map(gw.c::new).orElseThrow(() -> gw.f.createWithContext($$0, $$1));
      }

      public Predicate<czy> a(ImmutableStringReader $$0, gw.c $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, alg.a($$2, this.a));
      }

      @Override
      public Stream<ali> a() {
         return this.b.c_().map(alh::a);
      }

      @Override
      public Stream<ali> b() {
         return this.b.f().map(axt::b);
      }

      @Override
      public Stream<ali> c() {
         return Stream.concat(gw.i.keySet().stream(), this.c.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<ali> d() {
         return Stream.concat(gw.j.keySet().stream(), this.d.c_().map(alh::a));
      }

      public Predicate<czy> a(Predicate<czy> $$0) {
         return $$0.negate();
      }

      public Predicate<czy> b(List<Predicate<czy>> $$0) {
         return ag.b($$0);
      }
   }

   static record c(ali a, Decoder<? extends Predicate<czy>> b) {
      public c(jf.c<kt.b<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<czy> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<czy>> $$2 = this.b.parse($$1);
         return (Predicate<czy>)$$2.getOrThrow($$1x -> gw.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<czy> {
   }
}
