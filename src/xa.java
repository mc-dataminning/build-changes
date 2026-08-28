import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xa(xb l, xb m) {
   public static final Codec<xa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xb.a.fieldOf("chat").forGetter(xa::a), xb.a.fieldOf("narration").forGetter(xa::b)).apply($$0, xa::new)
   );
   public static final zc<wp, xa> b = zc.a(xb.b, xa::a, xb.b, xa::b, xa::new);
   public static final zc<wp, jo<xa>> c = za.a(lw.aI, b);
   public static final xb d = xb.a("chat.type.text");
   public static final ald<xa> e = a("chat");
   public static final ald<xa> f = a("say_command");
   public static final ald<xa> g = a("msg_command_incoming");
   public static final ald<xa> h = a("msg_command_outgoing");
   public static final ald<xa> i = a("team_msg_command_incoming");
   public static final ald<xa> j = a("team_msg_command_outgoing");
   public static final ald<xa> k = a("emote_command");

   private static ald<xa> a(String $$0) {
      return ald.a(lw.aI, ale.b($$0));
   }

   public static void a(qu<xa> $$0) {
      $$0.a(e, new xa(d, xb.a("chat.type.text.narrate")));
      $$0.a(f, new xa(xb.a("chat.type.announcement"), xb.a("chat.type.text.narrate")));
      $$0.a(g, new xa(xb.b("commands.message.display.incoming"), xb.a("chat.type.text.narrate")));
      $$0.a(h, new xa(xb.c("commands.message.display.outgoing"), xb.a("chat.type.text.narrate")));
      $$0.a(i, new xa(xb.d("chat.type.team.text"), xb.a("chat.type.text.narrate")));
      $$0.a(j, new xa(xb.d("chat.type.team.sent"), xb.a("chat.type.text.narrate")));
      $$0.a(k, new xa(xb.a("chat.type.emote"), xb.a("chat.type.emote")));
   }

   public static xa.a a(ald<xa> $$0, btr $$1) {
      return a($$0, $$1.dS().G_(), $$1.R_());
   }

   public static xa.a a(ald<xa> $$0, eu $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xa.a a(ald<xa> $$0, kc $$1, xe $$2) {
      kb<xa> $$3 = $$1.e(lw.aI);
      return new xa.a($$3.b($$0), $$2);
   }

   public xb a() {
      return this.l;
   }

   public xb b() {
      return this.m;
   }

   public static record a(jo<xa> b, xe c, Optional<xe> d) {
      public static final zc<wp, xa.a> a = zc.a(xa.c, xa.a::a, xg.d, xa.a::b, xg.e, xa.a::c, xa.a::new);

      a(jo<xa> $$0, xe $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xe a(xe $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xe b(xe $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xa.a c(xe $$0) {
         return new xa.a(this.b, this.c, Optional.of($$0));
      }

      public jo<xa> a() {
         return this.b;
      }

      public xe b() {
         return this.c;
      }

      public Optional<xe> c() {
         return this.d;
      }
   }
}
