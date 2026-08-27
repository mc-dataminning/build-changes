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

public class gq implements ArgumentType<gq.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> wx.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> wx.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> wx.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> wx.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> wx.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final akm h = new akm("count");
   static final Map<akm, gq.a> i = Stream.of(new gq.a(h, $$0 -> true, ct.d.d.map($$0 -> $$1 -> $$0.d($$1.I()))))
      .collect(Collectors.toUnmodifiableMap(gq.a::a, $$0 -> (gq.a)$$0));
   static final Map<akm, gq.c> j = Stream.of(new gq.c(h, ct.d.d.map($$0 -> $$1 -> $$0.d($$1.I()))))
      .collect(Collectors.toUnmodifiableMap(gq.c::a, $$0 -> (gq.c)$$0));
   private final bls<List<Predicate<cto>>> k;

   public gq(ea $$0) {
      gq.b $$1 = new gq.b($$0);
      this.k = gl.a($$1);
   }

   public static gq a(ea $$0) {
      return new gq($$0);
   }

   public gq.d a(StringReader $$0) throws CommandSyntaxException {
      return ac.a(this.k.a($$0))::test;
   }

   public static gq.d a(CommandContext<ee> $$0, String $$1) {
      return (gq.d)$$0.getArgument($$1, gq.d.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
      return this.k.a($$1);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(akm a, Predicate<cto> b, Decoder<? extends Predicate<cto>> c) {

      public static <T> gq.a a(ImmutableStringReader $$0, akm $$1, ka<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw gq.d.createWithContext($$0, $$1);
         } else {
            return new gq.a($$1, $$1x -> $$1x.b($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<cto> a(ImmutableStringReader $$0, akk<va> $$1, va $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cto>> $$3 = this.c.parse($$1, $$2);
         return (Predicate<cto>)$$3.getOrThrow($$1x -> gq.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gl.b<Predicate<cto>, gq.a, gq.c> {
      private final iz.b<ctj> a;
      private final iz.b<ka<?>> b;
      private final iz.b<ci.a<?>> c;
      private final akk<va> d;

      b(iz.a $$0) {
         this.a = $$0.b(lf.G);
         this.b = $$0.b(lf.av);
         this.c = $$0.b(lf.ax);
         this.d = $$0.a(ur.a);
      }

      public Predicate<cto> e(ImmutableStringReader $$0, akm $$1) throws CommandSyntaxException {
         ix.c<ctj> $$2 = this.a.a(akl.a(lf.G, $$1)).orElseThrow(() -> gq.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<cto> f(ImmutableStringReader $$0, akm $$1) throws CommandSyntaxException {
         jb<ctj> $$2 = this.a.a(awl.a(lf.G, $$1)).orElseThrow(() -> gq.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public gq.a g(ImmutableStringReader $$0, akm $$1) throws CommandSyntaxException {
         gq.a $$2 = gq.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            ka<?> $$3 = this.b.a(akl.a(lf.av, $$1)).map(ix::a).orElseThrow(() -> gq.d.createWithContext($$0, $$1));
            return gq.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<cto> a(ImmutableStringReader $$0, gq.a $$1, va $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      public Predicate<cto> a(ImmutableStringReader $$0, gq.a $$1) {
         return $$1.b;
      }

      public gq.c h(ImmutableStringReader $$0, akm $$1) throws CommandSyntaxException {
         gq.c $$2 = gq.j.get($$1);
         return $$2 != null ? $$2 : this.c.a(akl.a(lf.ax, $$1)).map(gq.c::new).orElseThrow(() -> gq.f.createWithContext($$0, $$1));
      }

      public Predicate<cto> a(ImmutableStringReader $$0, gq.c $$1, va $$2) throws CommandSyntaxException {
         return $$1.a($$0, this.d, $$2);
      }

      @Override
      public Stream<akm> a() {
         return this.a.c().map(akl::a);
      }

      @Override
      public Stream<akm> b() {
         return this.a.e().map(awl::b);
      }

      @Override
      public Stream<akm> c() {
         return Stream.concat(gq.i.keySet().stream(), this.b.b().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<akm> d() {
         return Stream.concat(gq.j.keySet().stream(), this.c.c().map(akl::a));
      }

      public Predicate<cto> a(Predicate<cto> $$0) {
         return $$0.negate();
      }

      public Predicate<cto> b(List<Predicate<cto>> $$0) {
         return ac.b($$0);
      }
   }

   static record c(akm a, Decoder<? extends Predicate<cto>> b) {
      public c(ix.c<ci.a<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<cto> a(ImmutableStringReader $$0, akk<va> $$1, va $$2) throws CommandSyntaxException {
         DataResult<? extends Predicate<cto>> $$3 = this.b.parse($$1, $$2);
         return (Predicate<cto>)$$3.getOrThrow($$1x -> gq.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<cto> {
   }
}
