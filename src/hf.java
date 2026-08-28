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

public class hf implements ArgumentType<hf.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xd.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xd.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xd.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xd.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xd.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final alb h = alb.b("count");
   static final Map<alb, hf.a> i = Stream.of(new hf.a(h, $$0 -> true, dh.d.d.map($$0 -> $$1 -> $$0.d($$1.J()))))
      .collect(Collectors.toUnmodifiableMap(hf.a::a, $$0 -> (hf.a)$$0));
   static final Map<alb, hf.c> j = Stream.of(new hf.c(h, dh.d.d.map($$0 -> $$1 -> $$0.d($$1.J()))))
      .collect(Collectors.toUnmodifiableMap(hf.c::a, $$0 -> (hf.c)$$0));
   private final bni<List<Predicate<cvl>>> k;

   public hf(ep $$0) {
      hf.b $$1 = new hf.b($$0);
      this.k = ha.a($$1);
   }

   public static hf a(ep $$0) {
      return new hf($$0);
   }

   public hf.d a(StringReader $$0) throws CommandSyntaxException {
      return ad.a(this.k.a($$0))::test;
   }

   public static hf.d a(CommandContext<et> $$0, String $$1) {
      return (hf.d)$$0.getArgument($$1, hf.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(alb a, Predicate<cvl> b, Decoder<? extends Predicate<cvl>> c) {

      public static <T> hf.a a(ImmutableStringReader $$0, alb $$1, kq<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw hf.d.createWithContext($$0, $$1);
         } else {
            return new hf.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cvl> a(ImmutableStringReader $$0, akz<vc> $$1, vc $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cvl>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cvl>)$$3.getOrThrow($$1x -> hf.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements ha.b<Predicate<cvl>, hf.a, hf.c> {
      private final jp.b<cvg> a;
      private final jp.b<kq<?>> b;
      private final jp.b<ct.a<?>> c;
      private final akz<vc> d;

      b(jp.a $$0) {
         this.a = $$0.b(lv.K);
         this.b = $$0.b(lv.aA);
         this.c = $$0.b(lv.aC);
         this.d = $$0.a(ut.a);
      }

      public Predicate<cvl> e(ImmutableStringReader $$0, alb $$1) throws CommandSyntaxException {
         jn.c<cvg> $$2 = this.a.a(ala.a(lv.K, $$1)).orElseThrow(() -> hf.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cvl> f(ImmutableStringReader $$0, alb $$1) throws CommandSyntaxException {
         jr<cvg> $$2 = this.a.a(axi.a(lv.K, $$1)).orElseThrow(() -> hf.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public hf.a g(ImmutableStringReader $$0, alb $$1) throws CommandSyntaxException {
         hf.a $$2 = hf.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kq<?> $$3 = this.b.a(ala.a(lv.aA, $$1)).map(jn::a).orElseThrow(() -> hf.d.createWithContext($$0, $$1));
            return hf.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cvl> a(ImmutableStringReader $$0, hf.a $$1, vc $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cvl> a(ImmutableStringReader $$0, hf.a $$1) {
         return $$1.b;
      }

      public hf.c h(ImmutableStringReader $$0, alb $$1) throws CommandSyntaxException {
         hf.c $$2 = hf.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(ala.a(lv.aC, $$1)).map(hf.c::new).orElseThrow(() -> hf.f.createWithContext($$0, $$1));
      }

      public Predicate<cvl> a(ImmutableStringReader $$0, hf.c $$1, vc $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<alb> a() {
         return this.a.c().map(ala::a);
      }

      @Override
      public Stream<alb> b() {
         return this.a.e().map(axi::b);
      }

      @Override
      public Stream<alb> c() {
         return Stream.concat(hf.i.keySet().stream(), this.b.b().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<alb> d() {
         return Stream.concat(hf.j.keySet().stream(), this.c.c().map(ala::a));
      }

      public Predicate<cvl> a(Predicate<cvl> $$0) {
         return $$0.negate();
      }

      public Predicate<cvl> b(List<Predicate<cvl>> $$0) {
         return ad.b($$0);
      }
   }

   static record c(alb a, Decoder<? extends Predicate<cvl>> b) {
      public c(jn.c<ct.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cvl> a(ImmutableStringReader $$0, akz<vc> $$1, vc $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cvl>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cvl>)$$3.getOrThrow($$1x -> hf.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cvl> {
   }
}
