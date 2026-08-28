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

public class gx extends bql<gx.d> {
   private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
   static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xc.b("argument.item.id.invalid", $$0));
   static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xc.b("arguments.item.tag.unknown", $$0));
   static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xc.b("arguments.item.component.unknown", $$0));
   static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("arguments.item.component.malformed", $$0, $$1));
   static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> xc.b("arguments.item.predicate.unknown", $$0));
   static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> xc.b("arguments.item.predicate.malformed", $$0, $$1));
   private static final alk h = alk.b("count");
   static final Map<alk, gx.a> i = Stream.of(new gx.a(h, $$0 -> true, cx.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(gx.a::a, $$0 -> (gx.a)$$0));
   static final Map<alk, gx.c> j = Stream.of(new gx.c(h, cx.d.d.map($$0 -> $$1 -> $$0.d($$1.M()))))
      .collect(Collectors.toUnmodifiableMap(gx.c::a, $$0 -> (gx.c)$$0));

   public gx(eg $$0) {
      super(gs.a(new gx.b($$0)).a($$0x -> ag.a($$0x)::test));
   }

   public static gx a(eg $$0) {
      return new gx($$0);
   }

   public static gx.d a(CommandContext<ek> $$0, String $$1) {
      return (gx.d)$$0.getArgument($$1, gx.d.class);
   }

   public Collection<String> getExamples() {
      return a;
   }

   static record a(alk a, Predicate<daa> b, Decoder<? extends Predicate<daa>> c) {

      public static <T> gx.a a(ImmutableStringReader $$0, alk $$1, kk<T> $$2) throws CommandSyntaxException {
         Codec<T> $$3 = $$2.b();
         if ($$3 == null) {
            throw gx.d.createWithContext($$0, $$1);
         } else {
            return new gx.a($$1, $$1x -> $$1x.c($$2), $$3.map($$1x -> $$2x -> {
                  T $$3x = $$2x.a($$2);
                  return Objects.equals($$1x, $$3x);
               }));
         }
      }

      public Predicate<daa> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<daa>> $$2 = this.c.parse($$1);
         return (Predicate<daa>)$$2.getOrThrow($$1x -> gx.e.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   static class b implements gs.b<Predicate<daa>, gx.a, gx.c> {
      private final ji.a a;
      private final ji.b<czw> b;
      private final ji.b<kk<?>> c;
      private final ji.b<ku.b<?>> d;

      b(ji.a $$0) {
         this.a = $$0;
         this.b = $$0.e(mi.K);
         this.c = $$0.e(mi.r);
         this.d = $$0.e(mi.q);
      }

      public Predicate<daa> e(ImmutableStringReader $$0, alk $$1) throws CommandSyntaxException {
         jg.c<czw> $$2 = this.b.a(alj.a(mi.K, $$1)).orElseThrow(() -> gx.b.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public Predicate<daa> f(ImmutableStringReader $$0, alk $$1) throws CommandSyntaxException {
         jk<czw> $$2 = this.b.a(axv.a(mi.K, $$1)).orElseThrow(() -> gx.c.createWithContext($$0, $$1));
         return $$1x -> $$1x.a($$2);
      }

      public gx.a g(ImmutableStringReader $$0, alk $$1) throws CommandSyntaxException {
         gx.a $$2 = gx.i.get($$1);
         if ($$2 != null) {
            return $$2;
         } else {
            kk<?> $$3 = this.c.a(alj.a(mi.r, $$1)).map(jg::a).orElseThrow(() -> gx.d.createWithContext($$0, $$1));
            return gx.a.a($$0, $$1, $$3);
         }
      }

      public Predicate<daa> a(ImmutableStringReader $$0, gx.a $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, ali.a($$2, this.a));
      }

      public Predicate<daa> a(ImmutableStringReader $$0, gx.a $$1) {
         return $$1.b;
      }

      public gx.c h(ImmutableStringReader $$0, alk $$1) throws CommandSyntaxException {
         gx.c $$2 = gx.j.get($$1);
         return $$2 != null ? $$2 : this.d.a(alj.a(mi.q, $$1)).map(gx.c::new).orElseThrow(() -> gx.f.createWithContext($$0, $$1));
      }

      public Predicate<daa> a(ImmutableStringReader $$0, gx.c $$1, Dynamic<?> $$2) throws CommandSyntaxException {
         return $$1.a($$0, ali.a($$2, this.a));
      }

      @Override
      public Stream<alk> a() {
         return this.b.c_().map(alj::a);
      }

      @Override
      public Stream<alk> b() {
         return this.b.f().map(axv::b);
      }

      @Override
      public Stream<alk> c() {
         return Stream.concat(gx.i.keySet().stream(), this.c.c().filter($$0 -> !$$0.a().d()).map($$0 -> $$0.h().a()));
      }

      @Override
      public Stream<alk> d() {
         return Stream.concat(gx.j.keySet().stream(), this.d.c_().map(alj::a));
      }

      public Predicate<daa> a(Predicate<daa> $$0) {
         return $$0.negate();
      }

      public Predicate<daa> b(List<Predicate<daa>> $$0) {
         return ag.b($$0);
      }
   }

   static record c(alk a, Decoder<? extends Predicate<daa>> b) {
      public c(jg.c<ku.b<?>> $$0) {
         this($$0.h().a(), $$0.a().a().map($$0x -> $$0x::a));
      }

      public Predicate<daa> a(ImmutableStringReader $$0, Dynamic<?> $$1) throws CommandSyntaxException {
         DataResult<? extends Predicate<daa>> $$2 = this.b.parse($$1);
         return (Predicate<daa>)$$2.getOrThrow($$1x -> gx.g.createWithContext($$0, this.a.toString(), $$1x));
      }
   }

   public interface d extends Predicate<daa> {
   }
}
