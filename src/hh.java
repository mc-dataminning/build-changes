import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hh implements ArgumentType<hh.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xh.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xh.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xh.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xh.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xh.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final alh h = alh.b("count");
   static final Map<alh, hh.a> i = Stream.of(new hh.a(h, $$0 -> true, di.d.d.map($$0 -> $$1 -> $$0.d($$1.L()))))
      .collect(Collectors.toUnmodifiableMap(hh.a::a, $$0 -> (hh.a)$$0));
   static final Map<alh, hh.c> j = Stream.of(new hh.c(h, di.d.d.map($$0 -> $$1 -> $$0.d($$1.L()))))
      .collect(Collectors.toUnmodifiableMap(hh.c::a, $$0 -> (hh.c)$$0));
   private final bnu<List<Predicate<cvx>>> k;

   public hh(er $$0) {
      hh.b $$1 = new hh.b($$0);
      this.k = hc.a($$1);
   }

   public static hh a(er $$0) {
      return new hh($$0);
   }

   public hh.d a(StringReader $$0) throws CommandSyntaxException {
      return ad.a(this.k.a($$0))::test;
   }

   public static hh.d a(CommandContext<ev> $$0, String $$1) {
      return (hh.d)$$0.getArgument($$1, hh.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(alh a, Predicate<cvx> b, Decoder<? extends Predicate<cvx>> c) {

      public static <T> hh.a a(ImmutableStringReader $$0, alh $$1, ks<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hh.d.createWithContext($$0, $$1);
         } else {
            return new hh.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cvx> a(ImmutableStringReader $$0, alf<vg> $$1, vg $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cvx>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cvx>)$$3.getOrThrow($$1x -> hh.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements hc.b<Predicate<cvx>, hh.a, hh.c> {
      private final jr.b<cvt> a;
      private final jr.b<ks<?>> b;
      private final jr.b<cu.a<?>> c;
      private final alf<vg> d;

      b(jr.a $$0) {
         this.a = $$0.d(ly.K);
         this.b = $$0.d(ly.az);
         this.c = $$0.d(ly.aB);
         this.d = $$0.a(ux.a);
      }

      public Predicate<cvx> e(ImmutableStringReader $$0, alh $$1) throws CommandSyntaxException {
         jp.c<cvt> $$2 = this.a.a(alg.a(ly.K, $$1)).orElseThrow(() -> hh.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cvx> f(ImmutableStringReader $$0, alh $$1) throws CommandSyntaxException {
         jt<cvt> $$2 = this.a.a(axp.a(ly.K, $$1)).orElseThrow(() -> hh.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hh.a g(ImmutableStringReader $$0, alh $$1) throws CommandSyntaxException {
         hh.a $$2 = hh.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            ks<?> $$3 = this.b.a(alg.a(ly.az, $$1)).map(jp::a).orElseThrow(() -> hh.d.createWithContext($$0, $$1));
            return hh.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cvx> a(ImmutableStringReader $$0, hh.a $$1, vg $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cvx> a(ImmutableStringReader $$0, hh.a $$1) {
         return $$1.b;
      }

      public hh.c h(ImmutableStringReader $$0, alh $$1) throws CommandSyntaxException {
         hh.c $$2 = hh.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(alg.a(ly.aB, $$1)).map(hh.c::new).orElseThrow(() -> hh.f.createWithContext($$0, $$1));
      }

      public Predicate<cvx> a(ImmutableStringReader $$0, hh.c $$1, vg $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<alh> a() {
         return this.a.c_().map(alg::a);
      }

      @Override
      public Stream<alh> b() {
         return this.a.f().map(axp::b);
      }

      @Override
      public Stream<alh> c() {
         return Stream.concat(hh.i.keySet().stream(), this.b.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<alh> d() {
         return Stream.concat(hh.j.keySet().stream(), this.c.c_().map(alg::a));
      }

      public Predicate<cvx> a(Predicate<cvx> $$0) {
         return $$0.negate();
      }

      public Predicate<cvx> b(List<Predicate<cvx>> $$0) {
         return ad.b($$0);
      }
   }

   static record c(alh a, Decoder<? extends Predicate<cvx>> b) {
      public c(jp.c<cu.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cvx> a(ImmutableStringReader $$0, alf<vg> $$1, vg $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cvx>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cvx>)$$3.getOrThrow($$1x -> hh.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cvx> {
   }
}
