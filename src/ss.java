import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ss(st j, st k) {
   public static final Codec<ss> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(st.a.fieldOf("chat").forGetter(ss::a), st.a.fieldOf("narration").forGetter(ss::b)).apply($$0, ss::new)
   );
   public static final st b = st.a("chat.type.text");
   public static final acp<ss> c = a("chat");
   public static final acp<ss> d = a("say_command");
   public static final acp<ss> e = a("msg_command_incoming");
   public static final acp<ss> f = a("msg_command_outgoing");
   public static final acp<ss> g = a("team_msg_command_incoming");
   public static final acp<ss> h = a("team_msg_command_outgoing");
   public static final acp<ss> i = a("emote_command");

   private static acp<ss> a(String $$0) {
      return acp.a(jc.aq, new acq($$0));
   }

   public static void a(nm<ss> $$0) {
      $$0.a(c, new ss(b, st.a("chat.type.text.narrate")));
      $$0.a(d, new ss(st.a("chat.type.announcement"), st.a("chat.type.text.narrate")));
      $$0.a(e, new ss(st.b("commands.message.display.incoming"), st.a("chat.type.text.narrate")));
      $$0.a(f, new ss(st.c("commands.message.display.outgoing"), st.a("chat.type.text.narrate")));
      $$0.a(g, new ss(st.d("chat.type.team.text"), st.a("chat.type.text.narrate")));
      $$0.a(h, new ss(st.d("chat.type.team.sent"), st.a("chat.type.text.narrate")));
      $$0.a(i, new ss(st.a("chat.type.emote"), st.a("chat.type.emote")));
   }

   public static ss.a a(acp<ss> $$0, bfj $$1) {
      return a($$0, $$1.dI().B_(), $$1.H_());
   }

   public static ss.a a(acp<ss> $$0, ds $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static ss.a a(acp<ss> $$0, hs $$1, sw $$2) {
      hr<ss> $$3 = $$1.d(jc.aq);
      return $$3.e($$0).a($$2);
   }

   public ss.a a(sw $$0) {
      return new ss.a(this, $$0);
   }

   public st a() {
      return this.j;
   }

   public st b() {
      return this.k;
   }

   public static record a(ss a, sw b, @Nullable sw c) {
      a(ss $$0, sw $$1) {
         this($$0, $$1, null);
      }

      public sw a(sw $$0) {
         return this.a.a().a($$0, this);
      }

      public sw b(sw $$0) {
         return this.a.b().a($$0, this);
      }

      public ss.a c(sw $$0) {
         return new ss.a(this.a, this.b, $$0);
      }

      public ss.b a(hs $$0) {
         hr<ss> $$1 = $$0.d(jc.aq);
         return new ss.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, sw b, @Nullable sw c) {
      public b(sf $$0) {
         this($$0.m(), $$0.l(), $$0.c(sf::l));
      }

      public void a(sf $$0) {
         $$0.d(this.a);
         $$0.a(this.b);
         $$0.a(this.c, sf::a);
      }

      public Optional<ss.a> a(hs $$0) {
         hr<ss> $$1 = $$0.d(jc.aq);
         ss $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new ss.a($$0x, this.b, this.c));
      }
   }
}
